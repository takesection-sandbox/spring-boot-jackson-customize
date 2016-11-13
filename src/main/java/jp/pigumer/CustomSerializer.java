package jp.pigumer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CustomSerializer extends StdSerializer<LocalDateTime> {

    public CustomSerializer() {
        this(null);
    }

    public CustomSerializer(Class<LocalDateTime> clazz) {
        super(clazz);
    }

    @Override
    public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        Instant i = value.atZone(ZoneId.of("Etc/GMT")).toInstant();
        gen.writeNumber(i.toEpochMilli());
    }
}
