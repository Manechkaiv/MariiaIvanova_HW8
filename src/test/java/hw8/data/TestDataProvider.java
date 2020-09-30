package hw8.data;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import hw8.data.beans.MetalsAndColorsData;
import org.testng.annotations.DataProvider;

import java.util.List;
import java.util.stream.Collectors;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestDataProvider {

    private static final String METALS_COLORS_DATA = "src/test/resources/JDI_ex8_metalsColorsDataSet.json";

    @DataProvider(name = "MetalsAndColors")
    public Object[][] getData() throws FileNotFoundException {
        return testDataBeans()
                .stream()
                .map(bean -> new MetalsAndColorsData[]{bean})
                .toArray(Object[][]::new);
    }

    public static List<MetalsAndColorsData> testDataBeans() throws FileNotFoundException {
        JsonObject jsonObject =
                new JsonParser().parse(
                        new FileReader(METALS_COLORS_DATA)).getAsJsonObject();
        return jsonObject
                .keySet()
                .stream()
                .map(key -> new Gson().fromJson(jsonObject.get(key), MetalsAndColorsData.class))
                .collect(Collectors.toList());
    }
}


