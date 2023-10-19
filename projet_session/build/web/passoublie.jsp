<%-- 
    Document   : passoublie
    Created on : 11 oct. 2023, 00:18:54
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.tailwindcss.com"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
        <title>Reset password</title>
    </head>

    <body class="flex items-center justify-center h-screen bg-sky-100 ">
        <div class="max-w-md mx-auto p-4  shadow-md bg-gray-100 flex rounded-2xl shadow-2xl">
            <fieldset class="mb-4">

                <form action="PassOublieController">
                    <div class="mt-4 ">
                        <label class="font-bold mt-4 flex items-center justify-center ">Veuillez saisir votre adresse e-mail</label>



                        <input class="p-2 mt-4 rounded-xl border" placeholder="Email" type="email" name="email" value="" required/>



                        <input type="submit" value="Envoyer" class="text-sm text-white  px-3 py-1 md:mt-8  border-2 border-sky-400 rounded-xl text-white bg-[#002D74] hover:text-sky-500 hover:border-sky-500 hover:bg-white hover:border-2 py-2 hover:scale-105 duration-300" />


                    </div>

                    <div class="  py-2 w-full rounded-xl mt-5 flex ">
                        <%  if (request.getParameter("msg") != null) {%>
                        <div class="col-span-3 flex justify-center text-red-500 font-bold"><%= request.getParameter("msg")%></div>
                        <% }%>





                    </div>
                    </div>
                </form>
            </fieldset>
        </div>
    </body>
</html>
