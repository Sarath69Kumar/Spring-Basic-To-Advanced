<#import "/spring.ftl" as spring />

<html>
	<head>
		<title>Add Person</title>
		<link 
			rel="stylesheet"
			type="text/css" href="<@spring.url'/css/style.css'/>"
		/>
	</head>
	<body>
		<#if errorMeassage??>
			<div style="color:red; font-style:italic;">
				${errorMessage}
			</div>
		</#if>
		
		<div>
			<fieldset>
				<legend>Add Person</legend>
				<form name = "personForm" action="" method="POST">
					FIRST NAME:<@spring.formInput "personForm.firstName" "" "text"/> <br/>
					LAST NAME:<@spring.formInput "personForm.lastName" "" "text"/>	<br/>
					<input type="submit" value="Create" />
				</form>
			</fieldset>
		</div>
		
	</body>
</html>