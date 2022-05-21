package javafx._197_209_todo_app;

import datamodel.ToDoData;
import datamodel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class Controller {

    private List<ToDoItem> todoItems;

    @FXML
    private ListView<ToDoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadlineLabel;

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private ContextMenu listContextMenu;

    public void initialize() {

        listContextMenu = new ContextMenu();
        MenuItem deleteMenuItem = new MenuItem();
        deleteMenuItem.setText("Delete");
        deleteMenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
                deleteItem(item);
            }
        });

        listContextMenu.getItems().addAll(deleteMenuItem);


//        ToDoItem item1 = new ToDoItem("Read a book",
//                "Elon Musk by Ashlee Vance",
//                LocalDate.of(2022, Month.AUGUST, 30));
//        ToDoItem item2 = new ToDoItem("Loose myBodyWeight",
//                "Train hard, min 4 and up to 6x per week at MyF",
//                LocalDate.of(2022, Month.MAY, 1));
//        ToDoItem item3 = new ToDoItem("Get BJJ belt",
//                "If it feels right - go for it - Bjj rules ;)",
//                LocalDate.of(2025, Month.JUNE, 22));
//        ToDoItem item4 = new ToDoItem("Finish JAVA MasterClass course",
//                "Java MasterClass course by Tim Buchalka @Udemy",
//                LocalDate.of(2022, Month.JUNE, 22));
//        ToDoItem item5 = new ToDoItem("Learn UX/UI",
//                "Explore UX/UI world for Web and Mobile Development",
//                LocalDate.of(2022, Month.JUNE, 22));
//
//        todoItems = new ArrayList<ToDoItem>();
//
//        todoItems.add(item1);
//        todoItems.add(item2);
//        todoItems.add(item3);
//        todoItems.add(item4);
//        todoItems.add(item5);
//
//        ToDoData.getInstance().setToDoItems(todoItems);


        todoListView.getSelectionModel().selectedItemProperty().
                addListener(new ChangeListener<ToDoItem>() {
                    @Override
                    public void changed(ObservableValue<? extends ToDoItem>
                                                observable,
                                        ToDoItem oldValue, ToDoItem newValue) {
                        if (newValue != null) {
                            ToDoItem item = todoListView.getSelectionModel().
                                    getSelectedItem();
                            itemDetailsTextArea.setText(item.getDetails());
                            DateTimeFormatter df = DateTimeFormatter.
                                    ofPattern("MMMM d, yyyy");
                            deadlineLabel.setText(df.format(item.getDeadline()));
                        }
                    }
                });

        todoListView.setItems(ToDoData.getInstance().getToDoItems());
        //todoListView.getItems().setAll(ToDoData.getInstance().getToDoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        todoListView.getSelectionModel().selectFirst();

        todoListView.setCellFactory
                (new Callback<ListView<ToDoItem>, ListCell<ToDoItem>>() {
                    @Override
                    public ListCell<ToDoItem> call(ListView<ToDoItem> param) {
                        ListCell<ToDoItem> cell = new ListCell<ToDoItem>() {

                            @Override
                            protected void updateItem(ToDoItem item, boolean empty) {
                                super.updateItem(item, empty);
                                if (empty) {
                                    setText(null);
                                } else {
                                    setText(item.getShortDescription());
                                    if (item.getDeadline().isBefore(LocalDate.now().
                                            plusDays(1))) {
                                        setTextFill(Color.RED);
                                    } else if (item.getDeadline().
                                            equals(LocalDate.now().plusDays(1))) {
                                        setTextFill(Color.YELLOWGREEN);
                                    }
                                }
                            }
                        };

                        cell.emptyProperty().addListener(
                                (obs, wasEmpty, isNowEmpty) -> {
                                    if (isNowEmpty) {
                                        cell.setContextMenu(null);
                                    } else {
                                        cell.setContextMenu(listContextMenu);
                                    }
                                }
                        );

                        return cell;
                    }
                });

    }


    @FXML
    public void showNewItemDialog() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Add new To-Do item");
        dialog.setHeaderText("Use this dialog to create a new To-Do item");

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("todoItemDialog.fxml"));


        try {
//            Parent root = FXMLLoader.load
//                    (getClass().getResource("todoItemDialog.fxml"));
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            DialogController controller = fxmlLoader.getController();
            ToDoItem newItem = controller.processResults();
//            todoListView.getItems().setAll(ToDoData.getInstance().getToDoItems());
            todoListView.getSelectionModel().select(newItem);
//
//            System.out.println("OK pressed");
        }
//        else{
//            System.out.println("Cancel pressed");
//        }
    }

    @FXML
    public void handleKeyPressed(KeyEvent keyEvent) {
        ToDoItem selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            if (keyEvent.getCode().equals(KeyCode.DELETE)) {
                deleteItem(selectedItem);
            }
        }
    }


    @FXML
    public void handleClickListView() {
        ToDoItem item = todoListView.getSelectionModel().getSelectedItem();

        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());

        //    System.out.println("The selected item is " + item);

//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadline().toString());
//        itemDetailsTextArea.setText(sb.toString());

        //itemDetailsTextArea.setText(item.getDetails());
    }


    public void deleteItem(ToDoItem item) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete To-Do Item");
        alert.setHeaderText("Delete item: " + item.getShortDescription());
        alert.setContentText("Are you sure? Press OK to confirm, or cancel to Back out.");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && (result.get() == ButtonType.OK)) {
            ToDoData.getInstance().deleteToDoItem(item);
        }
    }

}