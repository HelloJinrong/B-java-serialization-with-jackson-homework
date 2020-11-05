package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

public class AgeSerializer extends JsonSerializer<Integer> {
    @Override
    public void serialize(Integer value, JsonGenerator generator, SerializerProvider serializers) throws IOException {
        generator.writeNumber(0);
    }
}
