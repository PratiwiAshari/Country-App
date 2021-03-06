package com.example.thecountryapp;

public class NegaraAustralia {
    private String Title;
    private String Category ;
    private String Description ;
    private String Thumbnail ;
    private String IbuKota;

    public NegaraAustralia() {
    }

    public NegaraAustralia(String title, String category, String description, String thumbnail, String ibukota) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
        IbuKota = ibukota;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        Thumbnail = thumbnail;
    }

    public String getIbuKota() {
        return IbuKota;
    }

    public void setIbuKota(String ibuKota) {
        IbuKota = ibuKota;
    }
}

