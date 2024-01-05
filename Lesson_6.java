import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
       
            StringBuilder headerRow = new StringBuilder();
            for (String columnName : header) {
                headerRow.append(columnName).append(";");   
            }
            writer.write(headerRow.toString());
            writer.newLine();
            
            for (int[] row : data) {
                StringBuilder dataRow = new StringBuilder();
                for (int value : row) {
                    dataRow.append(value).append(";");
                }
                writer.write(dataRow.toString());
                writer.newLine();
            }

            System.out.println("Файл успешно сохранен!");

        } catch (IOException e) {
            System.out.println("Ошибка сохранения файла: " + e.getMessage());
        }
    }

    public void load(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            
            String headerRow = reader.readLine();
            header = headerRow.split(";");

            int numColumns = header.length;
            String dataRow;
            String[] dataValues;
            StringBuilder rows = new StringBuilder();
            while ((dataRow = reader.readLine()) != null) {
                rows.append(dataRow).append("\n");
            }
            String[] rowsArray = rows.toString().split("\n");
            int numRows = rowsArray.length;
            data = new int[numRows][numColumns];
            for (int i = 0; i < numRows; i++) {
                dataValues = rowsArray[i].split(";");
                for (int j = 0; j < numColumns; j++) {
                    data[i][j] = Integer.parseInt(dataValues[j]);
                }
            }

            System.out.println("Данные загружены успешно!");

        } catch (IOException e) {
            System.out.println("Ошибка загрузки файла: " + e.getMessage());
        }
    }


    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};

        AppData appData = new AppData(header, data);

        appData.save("data.csv");

        AppData loadedData = new AppData();
        loadedData.load("data.csv");

        System.out.println("Загруженный заголовок:");
        for (String columnName : loadedData.getHeader()) {
            System.out.print(columnName + " ");
        }
        System.out.println();

        System.out.println("Загруженные данные:");
        for (int[] row : loadedData.getData()) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}