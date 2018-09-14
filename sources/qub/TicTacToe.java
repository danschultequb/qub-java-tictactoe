package qub;

public class TicTacToe
{
    public static void main(String[] args)
    {
        try (final Process process = new Process(args))
        {
            TicTacToe.main(process);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    static void main(Process process)
    {
        process.setUseDisplayScaling(false);

        try (final Window window = process.createWindow())
        {
            window.setTitle("Qub Tic-Tac-Toe");

            window.setContent(new UIText(window, "Hello World!")
            {
                @Override
                public void paint(UIPainter painter)
                {
                    super.paint(painter);

                    painter.drawLine(Distance.inches(0.25), Distance.inches(0.25), Distance.inches(1), Distance.inches(0.25));
                    painter.drawLine(Distance.inches(1), Distance.inches(0.25), Distance.inches(1), Distance.inches(1));
                    painter.drawLine(Distance.inches(0.25), Distance.inches(0.25), Distance.inches(1), Distance.inches(1));
                    painter.drawLine(Distance.inches(0.25), Distance.inches(0.25), Distance.inches(0.25), Distance.inches(1));
                    painter.drawLine(Distance.inches(0.25), Distance.inches(1), Distance.inches(1), Distance.inches(1));
                }
            });

            window.setVisible(true);
            window.awaitClose();
        }
    }
}