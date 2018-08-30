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
        try (final Window window = process.createWindow())
        {
            window.setTitle("Qub Tic-Tac-Toe");

            window.setVisible(true);
            window.awaitClose();
        }
    }
}