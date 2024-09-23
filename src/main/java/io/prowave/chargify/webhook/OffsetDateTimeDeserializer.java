package io.prowave.chargify.webhook;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class OffsetDateTimeDeserializer extends JsonDeserializer<OffsetDateTime> implements ContextualDeserializer {

    private DateTimeFormatter formatter;

    public OffsetDateTimeDeserializer(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public OffsetDateTime deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException {
        String dateString = parser.getText();

        if (dateString == null || dateString.isEmpty()) {
            return null;
        }

        try {
            return OffsetDateTime.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Failed to parse OffsetDateTime with format: " + formatter, e);
        }
    }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException {
        if (property != null) {
            JsonFormat.Value format = property.findPropertyFormat(ctxt.getConfig(), OffsetDateTime.class);
            if (format != null && format.hasPattern()) {
                this.formatter = DateTimeFormatter.ofPattern(format.getPattern());
            }
        }
        return this;
    }
}
