package com.ojsmaina.qcode.utils;

import java.io.IOException;

import com.google.zxing.WriterException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WriterImpl implements Writer {

    private final String path;
    private final String charset;
    private final int height;
    private final int width;

    @Override
    public void fromJson(String source) throws IOException, WriterException {
        boolean isValidJson = InputChecker.validate(source);
        if(isValidJson) {
            QrUtils.write(source, path, charset, height, width);
        }
    }

    @Override
    public void fromString(String source) throws IOException, WriterException {
        QrUtils.write(source, path, charset, height, width);
    }
}
