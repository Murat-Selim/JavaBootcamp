--Select
--case insensitive
Select ContactName, CompanyName, City from Customers
Select * from Customers where City = 'London'

Select * from Products where CategoryID=1 or CategoryID=3
Select * from Products where categoryID=1 and UnitPrice<=20
Select * from Products order by CategoryID,ProductName
Select * from Products where unitprice<50 order by UnitPrice desc --ascending  --descending
Select count(*) from Products where CategoryID=5
Select count(*) Adet from Products
Select CategoryID, count(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10

Select Products.ProductID, Products.ProductsName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10
--DTO Data Tranformation Object

Select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID

Select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null