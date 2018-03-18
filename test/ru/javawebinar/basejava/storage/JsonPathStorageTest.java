package ru.javawebinar.basejava.storage;

import org.junit.Test;
import ru.javawebinar.basejava.storage.serializer.JsonStreamSerializer;
import ru.javawebinar.basejava.storage.serializer.XmlStreamSerializer;

import static org.junit.Assert.*;

public class JsonPathStorageTest extends AbstractStorageTest {

    public JsonPathStorageTest() {
        super (new PathStorage(STORAGE_DIR.getAbsolutePath(), new JsonStreamSerializer()));
    }
}