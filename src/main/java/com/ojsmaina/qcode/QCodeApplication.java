package com.ojsmaina.qcode;

import java.io.IOException;

import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.ojsmaina.qcode.utils.QrUtils;
import com.ojsmaina.qcode.utils.WriterImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QCodeApplication {

    public static void main(String[] args) throws IOException, WriterException, NotFoundException {
        SpringApplication.run(QCodeApplication.class, args);

        String data = "Another QR code";
        String path = "demo.png";
        // Encoding charset
        WriterImpl writer = new WriterImpl(path, "UTF-8", 200, 200);

        writer.fromString(data);
        System.out.println("QR Code Generated!!! ");

        System.out.println("code reads as " + QrUtils.read(path, "UTF-8"));
    }
}
