package Stack;

public class SomeStackAlgorithms {
    public static void main(String[] args) {
        System.out.println(paranthesisMatch("("));

    }

    static boolean paranthesisMatch(String text) {
        String opening = "([{";
        String closing = ")]}";

        SLLStack<Character> stack = new SLLStack<>();

        for (char character : text.toCharArray()) {
            if (opening.indexOf(character) != -1) {
                stack.push(character);
            } else if (closing.indexOf(character) != -1) {
                if(stack.isEmpty()) return false;
                if(closing.indexOf(character) != opening.indexOf(stack.pop())) return false;
            }
        }
        return stack.isEmpty();


    }
}
