package com.ojsmaina.qcode.utils;

import java.io.IOException;

import com.google.zxing.NotFoundException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReaderImpl implements Reader {
    private final String path;
    private final String charset;

    @Override
    public String read() throws NotFoundException, IOException {
       return QrUtils.read(path, charset);
    }
}
