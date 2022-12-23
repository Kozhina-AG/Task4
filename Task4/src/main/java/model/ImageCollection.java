package model;

import javafx.scene.image.Image;

public class ImageCollection implements Aggregate {
        private Image bi;
        private class ImageIterator implements Iterator {
        private int current = 0;

        @Override
        public boolean hasNext() {
            String img_name = "/" + (current + 1) + ".jfif";
            try {
                bi = new Image(img_name);
                return true;
            } catch (Exception ex) {

                current = 0;
                bi = new Image("/" + (current + 1) + ".jfif");
                return true;

            }
        }

        @Override
        public Object next() {
                current++;
                return bi;
        }

        public boolean hasPreview(){
            String img_name = null;

            System.out.println(current);

            if(current >= 2) {
                img_name = "/" + (current - 1) + ".jfif";
            }

                System.out.println(img_name);

            try {
                bi = new Image(img_name);
                return true;
            } catch (Exception ex) {
                System.err.println("Не удалось загрузить картинку! " + img_name);
                return false;
            }
        }

        @Override
        public Object preview() {
            current--;
            return bi;
        }
    }

    @Override
    public Iterator getIterator() {
        return new ImageIterator();
    }
}

