package com.avd.kotlin_test_app.model

/**
 * Created by Aleksey Dementyev on 08.01.2017.
 */

public class Competition : Dto() {

    public var id : Int = DEFAULT_INT
    public var caption : String = DEFAULT_STRING
    public var league : String = DEFAULT_STRING
    public var year : String = DEFAULT_STRING
    public var currentMatchday : Int = DEFAULT_INT
    public var numberOfMatchdays : Int = DEFAULT_INT
    public var numberOfTeams : Int = DEFAULT_INT
    public var numberOfGames : Int = DEFAULT_INT
    public var lastUpdated : String = DEFAULT_STRING

}