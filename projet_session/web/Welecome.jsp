<%-- 
    Document   : Welecome.jsp
    Created on : 10 oct. 2023, 20:37:26
    Author     : pc
--%>

<%@page import="ma.projet.services.EmployeService"%>
<%@page import="ma.projet.services.ClientService"%>
<%@page import="ma.projet.entities.Client"%>
<%@page import="ma.projet.entities.Employe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.tailwindcss.com"></script>
        <title>Welecome</title>
    </head>




    <%! Client clientconnecté;%>
    <%! Employe employeconnecté;%>


    <% HttpSession sessionuser = request.getSession();
        if (sessionuser != null) {

//            if(clientconnecté != null){clientconnecté = (Client) sessionuser.getAttribute("client") ;}
//            else if(employeconnecté != null){employeconnecté = (Employe) sessionuser.getAttribute("employe") ;}
            clientconnecté = (Client) sessionuser.getAttribute("client");
            employeconnecté = (Employe) sessionuser.getAttribute("employe");

        } else {

            response.sendRedirect("Authentification.jsp");

        }


    %>







    <body class="bg-sky-100">

        <section class="bg-sky-100 flex justify-center pt-40 py-40  pl-16 pr-16 self-center"> 
            <!-- login container -->
            <div class="bg-gray-100  rounded-2xl shadow-2xl    flex items-center pt-8 pb-8 justify-center p-5">
                <!-- form -->
                <div class="">
                    <h2 class="font-bold text-2xl text-green-500 flex items-center justify-center w-full ">LOGGED SUCCESSFULLY !</h2>
                    
                     <%             if (clientconnecté != null) {%>            
                    <div class="  py-2 w-full rounded-xl mt-5 flex ">

                        <div  class=" flex justify-center text-gray-900 font-bold" >Hello <%= clientconnecté.getNom() + " " + clientconnecté.getPrenom()%></div>
                        

                    </div>
                         <div class="  py-2 w-full rounded-xl mt-5 flex ">

                        <div  class=" flex justify-center text-gray-900 font-bold">EMAIL : <%= clientconnecté.getEmail()%></div>


                    </div>
                    <%}%>




                    <%
                if (employeconnecté != null) {%>            

                    <div class="  py-2 w-full rounded-xl mt-5 flex ">


                        <div style="text-align: center" class="col-span-3 flex justify-center text-gray-900 font-bold">EMAIL : <%= employeconnecté.getEmail()%> </div>


                    </div>
                    <%}%>


                    <form action="DeconnexionController" class="flex flex-col gap-4">
                        <input type="submit" name="deconnexion" value="Deconnexion" class="text-sm text-white  px-3 py-1 md:mt-8  border-2 border-sky-400 rounded-xl text-white bg-red-500 hover:text-sky-500 hover:border-sky-500 hover:bg-red-200 hover:border-2 py-2 hover:scale-105 duration-300" />
                    </form>


                    <div class="   w-full rounded-xl mt-1 flex "></div>





                   










                </div>


            </div>

        </section>
    </body>
</html>
