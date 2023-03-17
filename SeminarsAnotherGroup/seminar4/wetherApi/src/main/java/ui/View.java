package ui;

import presenter.Presenter;

public interface View {
    void start();
    void printAnswer(String answer);

    void setPresenter(Presenter presenter);
}
