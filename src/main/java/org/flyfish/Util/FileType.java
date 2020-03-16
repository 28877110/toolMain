package org.flyfish.Util;

import jdk.internal.org.xml.sax.helpers.DefaultHandler;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaMetadataKeys;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.xml.sax.ContentHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

//todo
public class FileType {
    public static String getEncoding(File file) {

        AutoDetectParser parser = new AutoDetectParser();
        parser.setParsers(new HashMap<>());

        Metadata metadata = new Metadata();
        metadata.add(TikaMetadataKeys.RESOURCE_NAME_KEY, file.getName());

        InputStream stream;
        try {
            stream = new FileInputStream(file);
            parser.parse(stream, (ContentHandler) new DefaultHandler(), metadata, new ParseContext());
            stream.close();
        } catch (TikaException | IOException e) {
            e.printStackTrace();
        } catch (org.xml.sax.SAXException e) {
            e.printStackTrace();
        }

        return metadata.get(HttpHeaders.CONTENT_ENCODING);
    }
}
