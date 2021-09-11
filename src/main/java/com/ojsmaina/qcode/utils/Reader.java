package com.ojsmaina.qcode.utils;

import java.io.IOException;

import com.google.zxing.NotFoundException;

public interface Reader {
    String read() throws NotFoundException, IOException;
}
