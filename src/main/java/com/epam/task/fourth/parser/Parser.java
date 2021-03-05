package com.epam.task.fourth.parser;

import sun.tools.jstat.ParserException;

public interface Parser {
    List<Candies> parse(String path) throws ParserException;
}
