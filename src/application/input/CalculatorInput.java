/*
 * MIT License
 *
 * Copyright (c) 2022 Konstantin Andreev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package application.input;

import application.functions.LogGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;

/**
 * The <b>CalculatorInput</b> class provides with basic functionality to get User Input.
 *
 * @author Konstantin Andreev
 */
public class CalculatorInput {
    private final LogGenerator lg;

    public CalculatorInput(LogGenerator lg){
        this.lg = lg;
    }

    /**
     * This method waits the User to make an input and returns its value.
     *
     * @return Returns the User input.
     */
    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
            return number;
        } catch (InputMismatchException ime) {
            lg.registerLog(Level.WARNING, "Only Integers are allowed! " + ime);
            return 0;
        }
    }
}
