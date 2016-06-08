# chargify-webhook-java
Java library to parse the request body of a Chargify Webhook.

## Quick Start

To use this `chargify-webhook-java` project, use clone and build this repository, or use Maven.

### Releases

Stable releases will be published to the central maven repository.

	<dependency>
		<groupId>com.prowave</groupId>
		<artifactId>chargify-webhook-java</artifactId>
		<version>1.0.0</version>
	</dependency>

### Snapshots

Snapshots are not automatically published.

## Usage

### Spring-MVC

The easiest way to parse the webhook request body is my allowing SpringMVC to convert the parameters to a `Map<String, String>` for you, and then pass that Map to the `ChargifyWebhookParser`.

	@Controller
	@RequestMapping("/chargify")
	public class ChargifyController {
	
		@RequestMapping(value = "/receiver", method = RequestMethod.POST)
		@ResponseBody
		public void receiver(@RequestParam Map<String, String> requestBody) throws IOException {
	
			ChargifyWebhook chargifyWebhook = ChargifyWebhookParser.parse(requestBody);
	
			if ("signup_success".equals(chargifyWebhook.getEvent())) {
	
				SignupSuccess ss = ChargifyMessageFactory.createChargifyMessage(chargifyWebhook.getPayload(),
						SignupSuccess.class);
	
			}
	
			if ("test".equals(chargifyWebhook.getEvent())) {
	
				Test test = ChargifyMessageFactory.createChargifyMessage(chargifyWebhook.getPayload(), Test.class);
	
			}
	
		}
	}

Once you have the `ChargifyWebhook` from the `ChargifyWebhookParser.parse()` method, you have 3 options to access the parsed data.  

1. You can access the `Map<String, Object>` directly from the `ChargifyWebhook.getPayload()` method.  This is a bit cumbersome as you need to cast you `Object`s to `String` or `Map<>` depending on what node you are on, and this requires knowledge of the message you received.

2. You can convert the Map to JSON using Jackson2 (which is a required dependency of this project.  This is as simple as

	String jsonMessage = mapper.writeValueAsString(chargifyWebhook);

or you can just convert the payload

	String jsonMessage = mapper.writeValueAsString(chargifyWebhook.getPayload());

3. There is a `ChargifyMessageFactory` that will convert the `ChargifyWebhook` to POJOs.  This is the preferred method as it strongly types the attributes of the message, and provides convenient getters and setters for all known and published attributes that come in from the Chargify webhook.

### Raw Request Body

Same as above, but you can pass the raw RequestBody as a `String` to the `ChargifyWebhookParser.parse()` method.

## Whats included

### Parser and limited POJO Support

* The requestBody parser
* The ability to create JSON for any webhook message type
* The `SignupSuccess` POJO and conversion of the message for that POJO

## Other Considerations

> **NOTE**<br>
> The current implementation only supports the `SignupSuccess` and `Test` message and its supporting components, such as `Site` and `Subscription`.  
> The `ChargifyMessageFactory` can and should be built out by other contributors as needed, and then issue a PR to merge back into this repo.
> Eventually, all message types will be supported and the Java community can easily consume Chargify Webhooks.
