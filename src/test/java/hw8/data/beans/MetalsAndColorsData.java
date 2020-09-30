package hw8.data.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.epam.jdi.tools.DataClass;

import static hw8.data.ResultSectionData.*;

public class MetalsAndColorsData extends DataClass<MetalsAndColorsData> {

    int[] summary;
    String[] elements;
    String color;
    String metals;
    String[] vegetables;

    public List<String> expectedResultList() {
        return Arrays.asList(
                SUMMARY + Arrays.stream(summary).sum(),
                ELEMENTS + getElementsInOneString(),
                COLOR + getColor(),
                METALS + getMetals(),
                VEGETABLES + getVegetablesInOneString());
    }

    public int[] getSummary() {
        return summary;
    }

    public void setSummary(int[] summary) {
        this.summary = summary;
    }

    public String[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMetals() {
        return metals;
    }

    public void setMetal(String metals) {
        this.metals = metals;
    }

    public String[] getVegetables() {
        return vegetables;
    }

    public void setVegetables(String[] vegetables) {
        this.vegetables = vegetables;
    }

    public String getElementsInOneString() {
        return String.join(", ", elements);
    }

    public String getVegetablesInOneString() {
        return String.join(", ", vegetables);
    }

    @Override
    public String toString() {
        return "MetalsAndColorsData{" +
                "summary=" + Arrays.toString(summary) +
                ", elements=" + Arrays.toString(elements) +
                ", color='" + color + '\'' +
                ", metals='" + metals + '\'' +
                ", vegetables=" + Arrays.toString(vegetables) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MetalsAndColorsData that = (MetalsAndColorsData) o;
        return Arrays.equals(summary, that.summary) &&
                Arrays.equals(elements, that.elements) &&
                Objects.equals(color, that.color) &&
                Objects.equals(metals, that.metals) &&
                Arrays.equals(vegetables, that.vegetables);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), color, metals);
        result = 31 * result + Arrays.hashCode(summary);
        result = 31 * result + Arrays.hashCode(elements);
        result = 31 * result + Arrays.hashCode(vegetables);
        return result;
    }
}