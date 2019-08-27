/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.bot.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A clickable action.
 */
public class CardAction {
    /**
     * The type of action implemented by this button. Possible values include:
     * 'openUrl', 'imBack', 'postBack', 'playAudio', 'playVideo', 'showImage',
     * 'downloadFile', 'signin', 'call', 'payment', 'messageBack'.
     */
    @JsonProperty(value = "type")
    private ActionTypes type;

    /**
     * Text description which appears on the button.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Image URL which will appear on the button, next to text label.
     */
    @JsonProperty(value = "image")
    private String image;

    /**
     * Text for this action.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * (Optional) text to display in the chat feed if the button is clicked.
     */
    @JsonProperty(value = "displayText")
    private String displayText;

    /**
     * Supplementary parameter for action. Content of this property depends on
     * the ActionType.
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * Channel-specific data associated with this action.
     */
    @JsonProperty(value = "channelData")
    private Object channelData;

    public static CardAction clone(CardAction cardAction) {
        if (cardAction == null) {
            return null;
        }

        return new CardAction() {{
           setValue(cardAction.getValue());
           setTitle(cardAction.getTitle());
           setDisplayText(cardAction.getDisplayText());
           setImage(cardAction.getImage());
           setType(cardAction.getType());
           setText(cardAction.getText());
           setChannelData(cardAction.getChannelData());
        }};
    }

    /**
     * Default empty CardAction
     */
    public CardAction() {

    }

    /**
     * Simplify creation of CardActions with string values.
     * @param input
     */
    public CardAction(String input) {
        setTitle(input);
        setValue(input);
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public ActionTypes getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param withType the type value to set
     */
    public void setType(ActionTypes withType) {
        this.type = withType;
    }

    /**
     * Get the title value.
     *
     * @return the title value
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title value.
     *
     * @param withTitle the title value to set
     */
    public void setTitle(String withTitle) {
        this.title = withTitle;
    }

    /**
     * Get the image value.
     *
     * @return the image value
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Set the image value.
     *
     * @param withImage the image value to set
     */
    public void setImage(String withImage) {
        this.image = withImage;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param withText the text value to set
     * @return the CardAction object itself.
     */
    public void setText(String withText) {
        this.text = withText;
    }

    /**
     * Get the displayText value.
     *
     * @return the displayText value
     */
    public String getDisplayText() {
        return this.displayText;
    }

    /**
     * Set the displayText value.
     *
     * @param withDisplayText the displayText value to set
     */
    public void setDisplayText(String withDisplayText) {
        this.displayText = withDisplayText;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param withValue the value value to set
     */
    public void setValue(Object withValue) {
        this.value = withValue;
    }

    /**
     * Gets the channelData value.
     */
    public Object getChannelData() {
        return this.channelData;
    }

    /**
     * Sets the channelData value.
     *
     * @param withChannelData The channelData object to set.
     */
    public void setChannelData(Object withChannelData) {
        this.channelData = withChannelData;
    }
}
