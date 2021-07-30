package sg.edu.rp.c346.id20018354.practical2;

import android.widget.TextView;

import java.io.Serializable;

public class Animals implements Serializable {
    private String Names;
    private String Diets;
    private String CName;
    private String SkinType;
    private String LifeSpan;
    private String Weights;
    private String Link;

    public Animals(String names) {
        Names = names;
    }

    public Animals(String names, String diets, String CName, String skinType, String lifeSpan, String weights, String link) {
        Names = names;
        Diets = diets;
        this.CName = CName;
        SkinType = skinType;
        LifeSpan = lifeSpan;
        Weights = weights;
        Link = link;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public String getDiets() {
        return Diets;
    }

    public void setDiets(String diets) {
        Diets = diets;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getSkinType() {
        return SkinType;
    }

    public void setSkinType(String skinType) {
        SkinType = skinType;
    }

    public String getLifeSpan() {
        return LifeSpan;
    }

    public void setLifeSpan(String lifeSpan) {
        LifeSpan = lifeSpan;
    }

    public String getWeights() {
        return Weights;
    }

    public void setWeights(String weights) {
        Weights = weights;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "Names='" + Names + '\'' +
                ", Diets='" + Diets + '\'' +
                ", CName='" + CName + '\'' +
                ", SkinType='" + SkinType + '\'' +
                ", LifeSpan='" + LifeSpan + '\'' +
                ", Weights='" + Weights + '\'' +
                ", Link='" + Link + '\'' +
                '}';
    }
}
