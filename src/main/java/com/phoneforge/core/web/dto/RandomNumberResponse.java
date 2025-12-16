package com.phoneforge.core.web.dto;

import com.phoneforge.core.domain.Province;

public record RandomNumberResponse(String number, String prefixUsed, Province province) {
}
