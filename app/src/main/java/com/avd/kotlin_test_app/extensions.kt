package com.avd.kotlin_test_app

import com.avd.kotlin_test_app.model.Dto
import com.fasterxml.jackson.databind.ObjectMapper

/**
 * Created by Aleksey Dementyev on 08.01.2017.
 */


fun <T : Dto> Dto.toJson(dto : T) : String {
    return Dto.mapper.writeValueAsString(dto)
}

inline fun <reified T : Dto> ObjectMapper.fromJson(json : String) : T {
    return this.readValue(json, T::class.java);
}