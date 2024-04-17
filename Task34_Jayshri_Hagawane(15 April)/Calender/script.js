const daysElement = document.querySelector('.days');
const monthYearElement = document.getElementById('monthYear');
const prevBtn = document.getElementById('prevBtn');
const nextBtn = document.getElementById('nextBtn');

const months = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];

let currentDate = new Date();
let events = [];

function renderCalendar() {
  const year = currentDate.getFullYear();
  const month = currentDate.getMonth();
  
  monthYearElement.textContent = months[month] + ' ' + year;

  const firstDayOfMonth = new Date(year, month, 1).getDay();
  const daysInMonth = new Date(year, month + 1, 0).getDate();

  daysElement.innerHTML = '';

  for (let i = 0; i < firstDayOfMonth; i++) {
    const dayElement = document.createElement('div');
    dayElement.classList.add('day');
    daysElement.appendChild(dayElement);
  }

  for (let i = 1; i <= daysInMonth; i++) {
    const dayElement = document.createElement('div');
    dayElement.classList.add('day');
    dayElement.textContent = i;
    dayElement.dataset.day = i;
    dayElement.addEventListener('click', () => handleDayClick(year, month, i));
    daysElement.appendChild(dayElement);

    const eventsForDay = events.filter(event => {
      const eventDate = new Date(event.date);
      return eventDate.getFullYear() === year && eventDate.getMonth() === month && eventDate.getDate() === i;
    });

    eventsForDay.forEach(event => {
      const eventElement = document.createElement('div');
      eventElement.classList.add('event');
      eventElement.textContent = event.title;
      dayElement.appendChild(eventElement);
    });
  }
}

function handleDayClick(year, month, day) {
  const date = new Date(year, month, day);
  const title = prompt('Enter event title:');
  if (title) {
    events.push({ date, title });
    renderCalendar();
  }
}

prevBtn.addEventListener('click', () => {
  currentDate.setMonth(currentDate.getMonth() - 1);
  renderCalendar();
});

nextBtn.addEventListener('click', () => {
  currentDate.setMonth(currentDate.getMonth() + 1);
  renderCalendar();
});

renderCalendar();
