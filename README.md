# Online-Book-Store
Online Book Store using Spring Project


#How to run the application 


# To be tested URLs :

# Can directly be tested in browser itself ,
 
 GET -   	http://51.20.6.252:8020/TechOnlineBkStore/api/books
 GET -   	http://51.20.6.252:8020/TechOnlineBkStore/api/books/{isbn}
 GET -	 	http://51.20.6.252:8020/TechOnlineBkStore/api/authors/{authorId}
 
# Should be tested only on POSTMAN Application 
 
 DELETE  -  http://51.20.6.252:8020/TechOnlineBkStore/api/books/{isbn}
 POST -		http://51.20.6.252:8020/TechOnlineBkStore/api/books
 PUT -		http://51.20.6.252:8020/TechOnlineBkStore/api/books/{isbn}/reviews
 PUT  -		http://51.20.6.252:8020/TechOnlineBkStore/api/books/{isbn}


# OR 
 
 

1. Open the Putty 
2. Enter the Host Name as "51.20.6.252" and make sure "connection"(seconds between keep alive)
   should be around 30
3. open the private key which is from Connection -> SSH -> Auth ->credentials ( Private key is given in the project , you can find it from /resource  in Git Project -> https://github.com/vml0512/TechnoOnlineBookStore.git.
4. Then Accept and Login as "ec2-user" then enter
5. Enter ls , it will list the jar file 
6.Run the saved .Jar file by following command , 'java -jar techconative-0.0.1-SNAPSHOT.jar.4'


Then you can try the URLs which are listed below,

# To be tested URLs :

Can be tested browser itself ,
 
 GET -   	http://51.20.6.252:8020/TechOnlineBkStore/api/books
 GET -   	http://51.20.6.252:8020/TechOnlineBkStore/api/books/{isbn}
 GET -	 	http://51.20.6.252:8020/TechOnlineBkStore/api/authors/{authorId}
 
# It should be tested only on POSTMAN Application 
 
 DELETE  -  http://51.20.6.252:8020/TechOnlineBkStore/api/books/{isbn}
 POST -		http://51.20.6.252:8020/TechOnlineBkStore/api/books
 PUT -		http://51.20.6.252:8020/TechOnlineBkStore/api/books/{isbn}/reviews
 PUT  -		http://51.20.6.252:8020/TechOnlineBkStore/api/books/{isbn}