import javax.swing.*;

public class test {

        public static void main(String[] args) {
            // Utwórz nowe okno (JFrame)
            JFrame frame = new JFrame("Moja Prosta Aplikacja");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ustawia zamknięcie aplikacji po zamknięciu okna
            frame.setSize(300, 200); // Rozmiar okna

            // Dodaj etykietę z tekstem
            JLabel label = new JLabel("Witaj w mojej pierwszej aplikacji Java!");
            label.setHorizontalAlignment(JLabel.CENTER); // Wyśrodkuj tekst
            frame.add(label); // Dodaj etykietę do okna

            // Wyświetl okno
            frame.setVisible(true);
        }

}
