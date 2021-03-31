
//
//  ViewController.kt
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//
class ViewController: UIViewController {
    @BindView() lateinit var scrollView: ScrollView
    @BindView() lateinit var contentView: View
    
    override fun viewDidLoad() {
        super.viewDidLoad()
        setupHeaderView()
        val profile = ProfileView()
        contentView.addSubview(profile)
        profile.isUserInteractionEnabled = true
        profile.translatesAutoresizingMaskIntoConstraints = false
        NSLayoutConstraint.activate(listOf(profile.widthAnchor.constraint(equalTo = contentView.widthAnchor), profile.centerXAnchor.constraint(equalTo = contentView.centerXAnchor), profile.topAnchor.constraint(equalTo = contentView.topAnchor, constant = 80), profile.heightAnchor.constraint(equalToConstant = 180)))
        val barcode = BarcodeView()
        contentView.addSubview(barcode)
        barcode.isUserInteractionEnabled = true
        barcode.translatesAutoresizingMaskIntoConstraints = false
        NSLayoutConstraint.activate(listOf(barcode.widthAnchor.constraint(equalTo = contentView.widthAnchor), barcode.centerXAnchor.constraint(equalTo = contentView.centerXAnchor), barcode.topAnchor.constraint(equalTo = profile.bottomAnchor, constant = 30), barcode.heightAnchor.constraint(equalToConstant = 290)))
        val testSection = TestInformationSection()
        contentView.addSubview(testSection)
        testSection.translatesAutoresizingMaskIntoConstraints = false
        NSLayoutConstraint.activate(listOf(testSection.leadingAnchor.constraint(equalTo = contentView.leadingAnchor, constant = 30), testSection.trailingAnchor.constraint(equalTo = contentView.trailingAnchor, constant = -30), testSection.topAnchor.constraint(equalTo = barcode.bottomAnchor, constant = 50), testSection.heightAnchor.constraint(equalToConstant = 260)))
        val userSection = UserInformationSection()
        contentView.addSubview(userSection)
        userSection.translatesAutoresizingMaskIntoConstraints = false
        NSLayoutConstraint.activate(listOf(userSection.leadingAnchor.constraint(equalTo = contentView.leadingAnchor, constant = 30), userSection.trailingAnchor.constraint(equalTo = contentView.trailingAnchor, constant = -30), userSection.topAnchor.constraint(equalTo = testSection.bottomAnchor, constant = 50), userSection.bottomAnchor.constraint(equalTo = contentView.bottomAnchor)))
    }
    
    fun setupHeaderView() {
        val headerView = View()
        view.addSubview(headerView)
        headerView.frame = CGRect(x = 0, y = 0, width = view.frame.width, height = 90)
        headerView.backgroundColor = .white
        headerView.layer.shadowColor = UIColor.black.cgColor
        headerView.layer.shadowOpacity = 0.3
        headerView.layer.shadowOffset = .zero
        headerView.layer.shadowRadius = 4
        val logo = ImageView(image = UIImage(named = "Logo"))
        logo.contentMode = .scaleAspectFit
        val menu = ImageView(image = UIImage(systemName = "line.horizontal.3"))
        menu.tintColor = .black
        menu.contentMode = .scaleAspectFit
        headerView.addSubview(logo)
        headerView.addSubview(menu)
        logo.translatesAutoresizingMaskIntoConstraints = false
        menu.translatesAutoresizingMaskIntoConstraints = false
        NSLayoutConstraint.activate(listOf(logo.leadingAnchor.constraint(equalTo = headerView.leadingAnchor, constant = 30), logo.bottomAnchor.constraint(equalTo = headerView.bottomAnchor, constant = -5), logo.heightAnchor.constraint(equalToConstant = 50), logo.widthAnchor.constraint(equalToConstant = 150), menu.trailingAnchor.constraint(equalTo = headerView.trailingAnchor, constant = -30), menu.bottomAnchor.constraint(equalTo = headerView.bottomAnchor, constant = -15)))
    }
}
