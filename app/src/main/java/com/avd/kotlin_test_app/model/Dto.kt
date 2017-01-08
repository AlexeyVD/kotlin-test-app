package com.avd.kotlin_test_app.model

import com.avd.kotlin_test_app.fromJson
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.ObjectMapper

/**
 * Created by Aleksey Dementyev on 08.01.2017.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class Dto {

    companion object {
        val DEFAULT_INT : Int = 0;
        val DEFAULT_STRING : String = "";
        val mapper : ObjectMapper = ObjectMapper()

        inline fun <reified T : Dto> fromJson(json : String) : T {
            return mapper.fromJson(json)
        }
    }
}