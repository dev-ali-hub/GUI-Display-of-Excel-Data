package Models;


import javafx.beans.property.SimpleFloatProperty;

import javafx.beans.property.SimpleStringProperty;

public class Individual
{
    private SimpleStringProperty PMA;
    private SimpleFloatProperty PA_No;
    private SimpleStringProperty rank;
    private SimpleStringProperty name;
    private SimpleStringProperty unit;
    private SimpleStringProperty med_cat;
    private SimpleStringProperty avn_basic_course;
    private SimpleStringProperty dob;
    private SimpleStringProperty doc;
    private SimpleStringProperty do_j_Avn;

    public Individual(String PMA, float PA_No, String rank, String name, String unit, String med_cat, String avn_basic_course, String dob, String doc, String do_j_Avn)
    {
        this.PMA = new SimpleStringProperty(PMA);
        this.PA_No = new SimpleFloatProperty(PA_No);
        this.rank = new SimpleStringProperty(rank);
        this.name = new SimpleStringProperty(name);
        this.unit = new SimpleStringProperty(unit);
        this.med_cat = new SimpleStringProperty(med_cat);
        this.avn_basic_course = new SimpleStringProperty(avn_basic_course);
        this.dob = new SimpleStringProperty(dob);
        this.doc = new SimpleStringProperty(doc);
        this.do_j_Avn = new SimpleStringProperty(do_j_Avn);
    }


    public String getPMA()
    {
        return PMA.get();
    }

    public SimpleStringProperty PMAProperty()
    {
        return PMA;
    }

    public float getPA_No()
    {
        return PA_No.get();
    }

    public SimpleFloatProperty PA_NoProperty()
    {
        return PA_No;
    }

    public void setPA_No(float PA_No)
    {
        this.PA_No.set(PA_No);
    }

    public String getRank()
    {
        return rank.get();
    }

    public SimpleStringProperty rankProperty()
    {
        return rank;
    }

    public String getName()
    {
        return name.get();
    }

    public SimpleStringProperty nameProperty()
    {
        return name;
    }

    public String getUnit()
    {
        return unit.get();
    }

    public SimpleStringProperty unitProperty()
    {
        return unit;
    }

    public String getMed_cat()
    {
        return med_cat.get();
    }

    public SimpleStringProperty med_catProperty()
    {
        return med_cat;
    }

    public String getAvn_basic_course()
    {
        return avn_basic_course.get();
    }

    public SimpleStringProperty avn_basic_courseProperty()
    {
        return avn_basic_course;
    }

    public String getDob()
    {
        return dob.get();
    }

    public SimpleStringProperty dobProperty()
    {
        return dob;
    }

    public String getDoc()
    {
        return doc.get();
    }

    public SimpleStringProperty docProperty()
    {
        return doc;
    }

    public String getDo_j_Avn()
    {
        return do_j_Avn.get();
    }

    public SimpleStringProperty do_j_AvnProperty()
    {
        return do_j_Avn;
    }

    public void setPMA(String PMA)
    {
        this.PMA.set(PMA);
    }

    public void setPA_No(int PA_No)
    {
        this.PA_No.set(PA_No);
    }

    public void setRank(String rank)
    {
        this.rank.set(rank);
    }

    public void setName(String name)
    {
        this.name.set(name);
    }

    public void setUnit(String unit)
    {
        this.unit.set(unit);
    }

    public void setMed_cat(String med_cat)
    {
        this.med_cat.set(med_cat);
    }

    public void setAvn_basic_course(String avn_basic_course)
    {
        this.avn_basic_course.set(avn_basic_course);
    }

    public void setDob(String dob)
    {
        this.dob.set(dob);
    }

    public void setDoc(String doc)
    {
        this.doc.set(doc);
    }

    public void setDo_j_Avn(String do_j_Avn)
    {
        this.do_j_Avn.set(do_j_Avn);
    }

    @Override public String toString()
    {
        return "Individual{" +
                "PMA=" + PMA +
                ", PA_No=" + PA_No +
                ", rank=" + rank +
                ", name=" + name +
                ", unit=" + unit +
                ", med_cat=" + med_cat +
                ", avn_basic_course=" + avn_basic_course +
                ", dob=" + dob +
                ", doc=" + doc +
                ", do_j_Avn=" + do_j_Avn +
                '}';
    }
}
