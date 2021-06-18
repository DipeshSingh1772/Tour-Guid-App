package com.example.tourguideapp

class CustomPlaces(_placesname:String, _placesImages:Int) {

    var Places_Name:String = _placesname
    var Places_Images:Int = _placesImages
    var Place_Category:String= "null"


    constructor(_placesname: String, _placecategory:String, _placesImages: Int)
            : this(_placesname, _placesImages) {
        Place_Category = _placecategory
    }


}