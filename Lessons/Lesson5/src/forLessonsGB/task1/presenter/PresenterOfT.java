package forLessonsGB.task1.presenter;

import forLessonsGB.task1.model.CalcModel;
import forLessonsGB.task1.model.Model;
import forLessonsGB.task1.view.View;

public class PresenterOfT<T extends CalcModel> {


    View view;
    Model model;

    public PresenterOfT(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
