/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object representing error information.
 */
public class Error {
    /**
     * Error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Error from inner http call
     */
    @JsonProperty(value = "innerHttpError")
    private InnerHttpError innerHttpError;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the Error object itself.
     */
    public Error withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the Error object itself.
     */
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Gets error from inner http call.
     */
    public InnerHttpError innerHttpError(){
        return this.innerHttpError;
    }

    /**
     * Sets error from inner http call.
     */
    public Error withInnerHttpError(InnerHttpError innerHttpError){
        this.innerHttpError = innerHttpError;
        return this;
    }
}