package com.phoneforge.core.domain;

import java.util.List;

public record Province(String ineCode, String name, String community, List<String> prefixes) {
}
