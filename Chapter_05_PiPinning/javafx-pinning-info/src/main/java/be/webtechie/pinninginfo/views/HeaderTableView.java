package be.webtechie.pinninginfo.views;

import be.webtechie.pinninginfo.data.HeaderPin;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Visualizes the header in a table.
 */
public class HeaderTableView extends TableView {

    private ObservableList<HeaderPin> data = FXCollections.observableArrayList();

    /**
     * Constructor to create the table visualization of the header.
     *
     * @param pins {@link List} of {@link HeaderPin} for which the header must be visualized.
     */
    public HeaderTableView(List<HeaderPin> pins) {
        this.setMinWidth(1000);

        TableColumn colPinNumber = new TableColumn("Pin n°");
        colPinNumber.setStyle("-fx-alignment: TOP-CENTER;");
        colPinNumber.setMinWidth(70);
        colPinNumber.setCellValueFactory(new PropertyValueFactory<>("pinNumber"));

        TableColumn colWiringPiNumber = new TableColumn("WiringPi n°");
        colWiringPiNumber.setStyle("-fx-alignment: TOP-CENTER;");
        colWiringPiNumber.setMinWidth(70);
        colWiringPiNumber.setCellValueFactory(new PropertyValueFactory<>("wiringPiNumber"));

        TableColumn colType = new TableColumn("Type");
        colType.setMinWidth(150);
        colType.setCellValueFactory(new PropertyValueFactory<>("pinType"));

        TableColumn colName = new TableColumn("Name");
        colName.setMinWidth(125);
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn colRemark = new TableColumn("Remark");
        colRemark.setMinWidth(550);
        colRemark.setCellValueFactory(new PropertyValueFactory<>("remark"));

        this.getColumns().addAll(colPinNumber,
                colWiringPiNumber,
                colType,
                colName,
                colRemark);

        this.data.addAll(pins);
        this.setItems(data);
    }
}