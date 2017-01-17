package com.ff.modeal.vo.app.map;

import java.util.List;

/**
 * Created by BIT on 2017-01-16.
 */

public class ChannelVo {
    private int totalCount;
    private String link;
    private int result;
    private String generator;
    private int pageCount;
    private String lastBuildDate;
    private List<ItemVo> item;
    private String title;
    private String description;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    public List<ItemVo> getItem() {
        return item;
    }

    public void setItem(List<ItemVo> item) {
        this.item = item;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ChannelVo{" +
                "totalCount=" + totalCount +
                ", link='" + link + '\'' +
                ", result=" + result +
                ", generator='" + generator + '\'' +
                ", pageCount=" + pageCount +
                ", lastBuildDate='" + lastBuildDate + '\'' +
                ", item=" + item +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
