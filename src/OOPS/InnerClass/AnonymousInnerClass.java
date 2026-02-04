package OOPS.InnerClass;

interface ClickListener {
    void onClick();
}

class Button {
    private String label;
    private ClickListener listener;

    public Button(String label) {
        this.label = label;
    }

    public void click() {
        System.out.println("Clicking button " + label + "...");
        if (listener != null) {
            listener.onClick();
        }
    }

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Button submitButton = new Button("Submit");

        submitButton.setClickListener(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Submit button clicked");
            }
        });

        submitButton.click();
    }
}


