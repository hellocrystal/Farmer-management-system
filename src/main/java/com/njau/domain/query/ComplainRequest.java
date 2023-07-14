package com.njau.domain.query;

/**
 * ComplainRequest
 *
 * @since 2022/04/21.
 */
public class ComplainRequest {

    private String type;
    private String content;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
