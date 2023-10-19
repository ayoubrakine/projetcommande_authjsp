<%-- 
    Document   : Inscription
    Created on : 10 oct. 2023, 12:13:24
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.tailwindcss.com"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

        <title>Inscription</title>
    </head>
    <body class="flex items-center justify-center h-screen bg-sky-100 ">
        <div class="max-w-md mx-auto pt-8 p-4 pr-16 pl-16  shadow-md bg-gray-100 flex rounded-2xl shadow-2xl">
            <fieldset class="mb-4">
                <legend class="text-lg font-semibold mt-16">S'inscrire en tant que</legend>
                <div class="mt-4 ">
                    <a href="InscriptionClient.jsp" class="mt-16 flex justify-center items-center block bg-blue-500 text-white px-4 py-2 w-full rounded mr-2 hover:bg-blue-600 hover:scale-105 duration-300 border-2 border-sky-400 rounded-xl text-white bg-[#002D74] hover:text-sky-500 hover:border-sky-500 hover:bg-white text-white ">
                        <i class="fas fa-user mr-2"></i> CLIENT
                    </a>

                    <a href="InscriptionEmploye.jsp" class="mt-5 flex justify-center items-center block bg-blue-500 text-white px-4 py-2 w-full rounded hover:bg-blue-600 hover:scale-105 duration-300 border-2 border-sky-400 rounded-xl text-white bg-[#002D74] hover:text-sky-500 hover:border-sky-500 hover:bg-white text-white">
                        <i class="fas fa-briefcase mr-2"></i> EMPLOYE
                    </a>

                </div>
            </fieldset>
        </div>
    </body>
</html>
