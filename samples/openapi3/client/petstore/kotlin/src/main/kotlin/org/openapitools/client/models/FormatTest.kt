/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
import java.io.Serializable
/**
 * 
 * @param integer 
 * @param int32 
 * @param int64 
 * @param number 
 * @param float 
 * @param double 
 * @param string 
 * @param byte 
 * @param binary 
 * @param date 
 * @param dateTime 
 * @param uuid 
 * @param password 
 * @param patternWithDigits A string that is a 10 digit number. Can have leading zeros.
 * @param patternWithDigitsAndDelimiter A string starting with 'image_' (case insensitive) and one to three digits following i.e. Image_01.
 */

data class FormatTest (
    @Json(name = "number")
    val number: java.math.BigDecimal,
    @Json(name = "byte")
    val byte: kotlin.ByteArray,
    @Json(name = "date")
    val date: java.time.LocalDate,
    @Json(name = "password")
    val password: kotlin.String,
    @Json(name = "integer")
    val integer: kotlin.Int? = null,
    @Json(name = "int32")
    val int32: kotlin.Int? = null,
    @Json(name = "int64")
    val int64: kotlin.Long? = null,
    @Json(name = "float")
    val float: kotlin.Float? = null,
    @Json(name = "double")
    val double: kotlin.Double? = null,
    @Json(name = "string")
    val string: kotlin.String? = null,
    @Json(name = "binary")
    val binary: java.io.File? = null,
    @Json(name = "dateTime")
    val dateTime: java.time.LocalDateTime? = null,
    @Json(name = "uuid")
    val uuid: java.util.UUID? = null,
    /* A string that is a 10 digit number. Can have leading zeros. */
    @Json(name = "pattern_with_digits")
    val patternWithDigits: kotlin.String? = null,
    /* A string starting with 'image_' (case insensitive) and one to three digits following i.e. Image_01. */
    @Json(name = "pattern_with_digits_and_delimiter")
    val patternWithDigitsAndDelimiter: kotlin.String? = null
) 
: Serializable 

{
	companion object {
		private const val serialVersionUID: Long = 123
	}
}

