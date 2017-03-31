package interfaces;

import interfaces.util.IClickable;
import interfaces.util.Runner;
import interfaces.util.TouchSystem;
import interfaces.util.View;

public class Main {

    public static void main(String[] args) {

        new Runner() {

            void bar() {
                TouchSystem ts = new TouchSystem();

                ts.setClickListener(new IClickable() {
                    @Override
                    public void onClick() {
                        System.out.println("OnClick in anonymous realization");
                    }
                });
                System.out.println("Outer");
                ts.onSystemClickEvent();
            }


            IClickable clickListener = new IClickable() {
                @Override
                public void onClick() {
                    System.out.println("OnClick in Main static implementation");
                }
            };

            @Override
            public void onClick() {
                System.out.println("OnClick in Runner implementation");
            }

            public void run() {
                TouchSystem ts = new TouchSystem();
                View view = new View();
                ts.setClickListener(view);
                ts.onSystemClickEvent();

                ts.setClickListener(clickListener);
                ts.onSystemClickEvent();

                ts.setClickListener(new IClickable() {
                    @Override
                    public void onClick() {
                        System.out.println("OnClick in anonymous realization");
                    }
                });
                ts.onSystemClickEvent();

                ts.setClickListener(this);
                ts.onSystemClickEvent();
            }
        }.run();

    }

}
