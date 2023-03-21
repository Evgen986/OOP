package forLessonsGB.task1;

import forLessonsGB.task1.model.SumModel;
import forLessonsGB.task1.presenter.Presenter;
import forLessonsGB.task1.view.View;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(), new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
