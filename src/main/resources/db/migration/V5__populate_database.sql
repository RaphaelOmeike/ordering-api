INSERT INTO categories (name)
VALUES ('Fruits'),
       ('Vegetables'),
       ('Dairy'),
       ('Bakery'),
       ('Beverages'),
       ('Snacks');


INSERT INTO products (name, price, description, category_id)
VALUES ('Banana', 0.59, 'Fresh organic bananas from local farms.', 1),
       ('Broccoli', 1.79, 'Green broccoli heads, packed with nutrients.', 2),
       ('Whole Milk', 2.99, '1 gallon of whole cow milk, pasteurized.', 3),
       ('Cheddar Cheese', 3.49, '8 oz sharp cheddar cheese block.', 3),
       ('Sourdough Bread', 4.25, 'Freshly baked artisan sourdough loaf.', 4),
       ('Orange Juice', 3.99, '100% pure orange juice with no added sugar.', 5),
       ('Potato Chips', 1.99, 'Classic salted potato chips, 200g bag.', 6),
       ('Apple', 0.89, 'Crisp and juicy red apples, sold per piece.', 1),
       ('Carrots', 1.50, '1 lb of washed and peeled carrots.', 2),
       ('Chocolate Bar', 1.25, 'Dark chocolate bar with 70% cocoa.', 6);
