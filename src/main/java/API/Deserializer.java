package API;

import io.qameta.allure.internal.shadowed.jackson.core.JacksonException;
import io.qameta.allure.internal.shadowed.jackson.core.JsonParser;
import io.qameta.allure.internal.shadowed.jackson.databind.DeserializationContext;
import io.qameta.allure.internal.shadowed.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deserializer extends JsonDeserializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd`T`hh:mm:ss.SSS`Z`");
        return LocalDateTime.parse(jsonParser.getText(), formatter);
    }
}
