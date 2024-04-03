rootProject.name = "Aluguel"
include("src:main:Application")
findProject(":src:main:Application")?.name = "Application"
include("src:Application")
findProject(":src:Application")?.name = "Application"
include("src:Entities")
findProject(":src:Entities")?.name = "Entities"
