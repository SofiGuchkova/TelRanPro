--В рамках БД "песочница"  напишите след/запросы:--


 -- Вывести данные о товарах (название товара, ценасоскидкой_0.5%) --
    SELECT
    ProductName,
    Price * .995 AS Price_with_discount
    FROM Products

  -- Вывести заказы клиентов не из France  (номерзаказа, имяклиента, страна_клиента) --

  SELECT
  OrderID,
  Customers.CustomerName,
  Customers.Country
  FROM Orders
  INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID
  WHERE Customers.Country != 'France'

 -- Вывести название и стоимость в USD одного самого дорогого проданного товара (не используя агрегацию) --
SELECT
Products.ProductName,
Products.Price * 1.08 AS Price_in_usd
FROM OrderDetails
JOIN Products ON OrderDetails.ProductID = Products.ProductID
Order by Products.Price DESC
Limit 1 Offset 0


  -- Вывести список стран, которые поставляют морепродукты --
  SELECT DISTINCT
  Suppliers.Country
  FROM Products
  JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
  JOIN Categories ON Products.CategoryID = Categories.CategoryID
  Where
  Categories.CategoryID = '8';

 -- Вывести два самых дорогих товара из категории Beverages из USA --
SELECT *
FROM Products
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE
Suppliers.Country = 'USA'
AND
Categories.CategoryName = 'Beverages'
ORDER BY Products.Price DESC
LIMIT 2 OFFSET 0