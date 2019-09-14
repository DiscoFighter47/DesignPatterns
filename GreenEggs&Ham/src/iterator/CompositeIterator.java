package iterator;

import java.util.Iterator;
import java.util.Stack;

import menu.Menu;
import menu.MenuComponent;

public class CompositeIterator implements Iterator<MenuComponent> {
	private Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		}
		Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
		if (!iterator.hasNext()) {
			stack.pop();
			return hasNext();
		}
		return true;
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		}
		return null;
	}
}
