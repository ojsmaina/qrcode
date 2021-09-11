package com.ojsmaina.qcode.utils;

import java.io.IOException;

import com.google.zxing.WriterException;

public interface Writer {
    void fromJson(String source) throws IOException, WriterException;
    void fromString(String source) throws IOException, WriterException;
}
